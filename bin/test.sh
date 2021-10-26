javac -cp /opt/assertj.jar:/opt/commons_lang3.jar -sourcepath "/exercises-java/src" *.java 2>&1 || exit 1;
java -cp `pwd`:/exercises-java/src:/opt/assertj.jar:/opt/commons_lang3.jar Test 2>&1
