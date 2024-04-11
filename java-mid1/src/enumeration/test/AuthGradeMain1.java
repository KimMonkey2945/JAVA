package enumeration.test;

import java.util.Arrays;

public class AuthGradeMain1 {

    public static void main(String[] args) {

//        System.out.println("grade : " + AuthGrade.GUEST +  ", level : " + AuthGrade.GUEST.getLevel() + ", 설명 : " + AuthGrade.GUEST.getDescription());
//        System.out.println("grade : " + AuthGrade.LOGIN +  ", level : " + AuthGrade.LOGIN.getLevel() + ", 설명 : " + AuthGrade.LOGIN.getDescription());
//        System.out.println("grade : " + AuthGrade.ADMIN +  ", level : " + AuthGrade.ADMIN.getLevel() + ", 설명 : " + AuthGrade.ADMIN.getDescription());
        AuthGrade [] values = AuthGrade.values();
        for(AuthGrade ag : values){
            System.out.println("grade=" + ag.name() + ", level=" +
                    ag.getLevel() + ", 설명=" + ag.getDescription());
        }

    }

}
