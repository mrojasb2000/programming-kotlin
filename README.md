# Programming Kotlin


# Compile:
kotlinc filename.kt -include-runtime -d filename.jar
	
# Execute:
java -jar filename.jar
	
# Check bytecode:
javap -c filenameKt.class

# Scripting Kotlin
kotlic -script filename.kts