package com.ohgiraffers.section04.constructor;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 생성자의 작성 위치
     * 문법상 클래스 내부에 작성하면 되지만, 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
     *  */

    /* 생성자의 사용 목적
     * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우
     * 2. 매개변수 있는 생성자의 경우 매개변수로 전달 받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용
     * 3. 작성한 생정자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미
     *    따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용 가능 (초기값 전달 강제화)
     * */

    /* 기본 생성자(default constructor) */
    public User() {
        /*인스턴스 생성 시점에 수행할 명령이 있는 경우 작성할 수 있다. */
        System.out.println("User 클래스의 기본 생성자 호출함...");
    }

    /* 2. 매개변수 생성자*/
    /* 초기화 할 필드가 여러 개인 경우, 초기화 하고 싶은 필드의 조합별로 생성자를 여러 개 작성할 수 있다. */
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
    }

    public User(String id, String pwd, String name, java.util.Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
        /* this()는 동일한 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
        * 괄호 안의 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다. (메소드와 동일)
        * 리턴 되어 돌아오지만 리턴 값은 존재하지 않으며 가장 첫 줄에 선언해야 한다. (그렇지 않으면 컴파일 에러)*/
        this(id, pwd, name);
        this.enrollDate = enrollDate;

        System.out.println("User 클래스의 id, pwd, name, enrollDate을 초기화하는 생성자 호출함...");
    }

    public String getInformation() {
        return "User[id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }


}
