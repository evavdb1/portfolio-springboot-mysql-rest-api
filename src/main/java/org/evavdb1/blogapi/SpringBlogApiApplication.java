package org.evavdb1.blogapi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBlogApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBlogApiApplication.class, args);
    }

}
/*
v models
v repo
v service
v controller
v exception
v config
v appl.prop
v bootstrap package

v postman collection
    *       SEE FILE postman_collection.json

v SQL schema
    * used WorkBench (
        08:22:50 Dumping postcommentdb (all tables)
Running: mysqldump.exe --defaults-file="C:*** ~1\AppData\Local\Temp\tmpknul4dv9.cnf"  --host=localhost --port=3306 --default-character-set=utf8 --user=root --protocol=tcp --skip-triggers "postcommentdb"
08:22:51 Export of C:\Users\eva duh\IdeaProjects\Spring_BlogAPI\postcommentsdb_dump.sql has finished
        )   SEE FILE postcommentsdb_dump.sql
    * intellij SQL generator
            SEE FILES post.sql & comments.sql
    * terminal command : "mysqldump -u intec -p postcommentsdb > postcomm.sql"
            SEE FILE postcomm.sql

*/
