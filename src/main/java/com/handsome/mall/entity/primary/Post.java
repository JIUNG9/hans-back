package com.handsome.mall.entity.primary;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "post_body", length = 255)
    private String body;

    @Column(name = "post_title", length = 50)
    private String title;

    @Column(name = "post_reg_date")
    private LocalDateTime regDate;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;


}
