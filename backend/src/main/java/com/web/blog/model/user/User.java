// 하단 DB 설정 부분은 Sub PJT II에서 데이터베이스를 구성한 이후에 주석을 해제하여 사용.

package com.web.blog.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    private String nickname;

    private String password;

    private String email;

    private String intro;

    @Column(name = "profile_image")
    private String profile_image;

    @JsonIgnore
    @Column(insertable = false, updatable = false)
    private LocalDateTime createDate;

    @NotNull
    private Integer penalty;
    
    @NotNull
    private Integer mileage;

    @NotNull
    private double score1;
    
    @NotNull
    private double score2;
    
    @NotNull
    private double score3;

    private Integer totalscoreper;
}
