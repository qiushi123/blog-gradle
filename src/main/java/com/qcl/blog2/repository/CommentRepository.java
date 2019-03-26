package com.qcl.blog2.repository;

import com.qcl.blog2.domain.Comment;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Comment 仓库.
 *
 * @since 1.0.0 2017年4月7日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
