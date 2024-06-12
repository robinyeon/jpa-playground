package com.hobom.jpa_prac;

import com.hobom.jpa_prac.mapping.entity.Member;
import com.hobom.jpa_prac.mapping.entity.Order;

public class MappingMain {
    public static void main(String[] args) {
        Member member = new Member();
        Order order = new Order();
        order.setMember(member);
    }
}
