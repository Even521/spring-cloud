package com.even.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

/**
 * @author even
 * @date 2020/4/2 0002
 * @describe
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TASK_RUN_OUTPUT")
@Entity
public class TaskRunOutPut {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String output;
}
