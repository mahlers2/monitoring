& docker stop buchungsservice

& docker rm buchungsservice

& docker build --rm -t buchungsservice .

& docker run --link myredis --name buchungsservice -p 8080:8080 -it -d buchungsservice
