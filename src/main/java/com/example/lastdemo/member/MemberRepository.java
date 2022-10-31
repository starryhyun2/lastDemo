package com.example.lastdemo.member;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Collection;
import java.util.List;
@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
//List<Member>findByID(String id);
}

