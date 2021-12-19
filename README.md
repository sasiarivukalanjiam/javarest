# IDE - windows
https://mirror.kakao.com/eclipse/oomph/epp/2021-12/R/eclipse-inst-jre-win64.exe


# javarest
building rest api based application using java maven eclipse 

# to build package the applicatoon
mvn clean package -Dmaven.test.skip=true 


# to start the server 
mvn jetty:run

# to stop the server 
mvn jetty:stop

# mycalc
# sample API call 
http://127.0.0.1:9999/mycalc/api/mycalc/add?x=4&y=6





# security
# sample API call
http://127.0.0.1:9999/security/api/crypto/encrypt?encrypt=premsasikumar

Output: 

{
    "time": "Mon Dec 20 05:06:17 IST 2021",
    "result": "Plain text is encrypted",
    "x": "premsasikumar",
    "y": "5P9B0ypMsozgeqVnvX3mTg=="
}





http://127.0.0.1:9999/security/api/crypto/decrypt?decrypt=5P9B0ypMsozgeqVnvX3mTg==

output:

{
    "time": "Mon Dec 20 05:05:23 IST 2021",
    "result": "Encrypted text is converted to plain text",
    "x": "5P9B0ypMsozgeqVnvX3mTg==",
    "y": "premsasikumar"
}
