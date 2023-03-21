package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable //값 타입 정의
@Getter
public class Address {

    private String city;

    private String street;

    private String zipcode;

    /*
    새로 생성은 가능하지만 값타입 변경을 불가능하게 설계 하기위해 @Setter는 제거
    JPA스펙상 엔티티나 임베디드 타입은 자바 기본 생성자 public또는 protected로 설정
    public 으로 두는 것 보다 protected로 설정하는 것이 그나마 더 안전
    JPA가 이런 제약을 두는 이유는 JPA구현 라이브러리가 객체를 생성할 때 리플렉션 같은 기술을 사용할 수 있도록 지원해야 하기 때문
     */
    protected Address() {}
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
