package org.example;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main01 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        String s = "In the two decades since I was born, I have experienced first-hand the extremely impressive impact the information revolution has had on the world. From small java-written programs on flip phones as a child to the diverse functionality of websites and large applications on smart devices today, I am fascinated by the power of information technology to change the world. But although I excelled in my GCSEs and went on to study at a top university, I was enrolled in an energy course rather than the one I was interested in. I knew then that my future would be to work for a state-owned company after graduation and then rise through the ranks mainly on the basis of seniority and connections, just like my parents. My motivation to study was to get into Zhejiang University before I got there, but after I got there, I suddenly lost all my goals and direction. I spent a lot of time thinking about the direction and meaning of my life. Before I graduated, I decided to break away from the established trajectory of my life, that is, from the path my parents would have preferred me to follow. This was influenced by my girlfriend Kongjia, who was studying CS at NUS at the time, and I gradually felt that this was the direction I wanted to explore and study from my heart. I knew that what I was best at was logic, and what I was most fascinated by happened to be information technology.\n" +
//                "\n" +
//                "Soon after I graduated, Kongjia enrolled in the programme at your college and she recommended it to me, and I knew then that it offered exactly what I needed and emailed her for more information. However, I knew that although I had taught myself some relevant skills, I had not achieved satisfactory results in my undergraduate studies to prove myself, so I planned in detail and embarked on a new path in life.\n" +
//                "\n" +
//                "While I continued to study my professional skills, I first obtained an IELTS 7 and then applied for a Master's degree in IT at James Cook University, which gave me the opportunity to adapt to the Singaporean environment while continuing to build my professional skills and experience. During my year of study at the Master, I was very conscious of the lack of practical experience in the courses offered by the university in comparison to the project I am currently applying for, so I actively dabbled in Python, C and C#, while learning most of the technical stack required for a junior Java engineer and completed two fully functional personal projects, the first being a Java-based project using Bootstrap. The first is a Java-based personal memo tool using Bootstrap+JSP+Servlet+Tomcat+MySQL. The other is a Java-based e-commerce platform project using SpringBoot+SpringMVC+MyBatis+Redis, which I have also written a C-based project to simulate the tabletop game Regicide on a Linux system out of interest, as well as other small projects based on Java and Python, Python based projects. I am also interested in data structures and algorithms, as this is my area of logical thinking. I often delved into the mechanics of algorithmic problems on the Force Snap website, which helped me pass written algorithm tests at big companies such as Alibaba and Rakuten. These efforts, and the technical stack I gained from them, helped me to secure an internship at Alibaba Group before I graduated. During my internship, I assisted senior engineers in developing many interfaces in a SpringBoot+SpringSecurity environment, such as login authorisation, captcha generation, token generation verification and refresh, database operations including table CRUD, calculations and import and export.\n" +
//                "\n" +
//                "I have benefited from these experiences and gained practical experience as well as consolidating my theoretical knowledge. I now believe that I am fully prepared for the programme, not only from a motivational point of view, but also from a skills perspective.";
//        System.out.println(s.length());

    }
    public static <T> T t(Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T tt = clazz.getConstructor().newInstance();
        return tt;
    }

}
