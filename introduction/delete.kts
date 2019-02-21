import java.io.File

val rootPath = args[0]
val olderDays = args[1].toLong()

val purgeTime = System.currentTimeMillis() - olderDays * 24 * 60 * 60 * 1000

val folders = File(rootPath).listFiles { file -> file.isFile }

folders?.filter { file -> file.lastModified() < purgeTime }?.forEach{
	file -> println("Deleting ${file.absolutePath}")
	//file.delete()
}