javac -sourcepath "/exercises-java/src" *.java 2>&1 || exit 1;
java -cp `pwd`:/exercises-java/src -ea Test 2>&1
