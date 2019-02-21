# Programming Kotlin


# Compile:
kotlinc filename.kt -include-runtime -d filename.jar
	
# Execute:
java -jar filename.jar
	
# Check bytecode:
javap -c filenameKt.class

# Scripting Kotlin
kotlic -script filename.kts

# Create project with Gradle
gradle init --type kotlin-application
or
gradle init --type kotlin-library

# Build and Run project
gradle build
gradle run