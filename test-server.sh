./gradlew build
cp build/libs/Unpredictor* server-test/plugins/Unpredictor.jar
cd server-test
java -jar server.jar -nogui
