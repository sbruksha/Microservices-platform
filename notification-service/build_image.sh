DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

echo -n "Enter Image Tag, or leave blank for 'latest'"
read TAG
if [ -z $TAG ]; then
    TAG="latest"
fi

rm -rf build/libs/*.jar
./gradlew clean build

docker build -t eodessa/notification-service:$TAG -f $DIR/Dockerfile $DIR
