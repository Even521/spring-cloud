package com.even.config;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author even
 * @date 2020/4/2 0002
 * @describe
 */
public interface TaskRunRepository extends JpaRepository<TaskRunOutPut, Long> {
}
