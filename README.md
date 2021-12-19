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


# sample API call
http://127.0.0.1:9999/mycalc/api/mycalc/add?x=4&y=6
