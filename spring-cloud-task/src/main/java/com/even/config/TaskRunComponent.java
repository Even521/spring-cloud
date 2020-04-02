package com.even.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author even
 * @date 2020/4/2 0002
 * @describe
 */
@Log4j2
@RequiredArgsConstructor
@Component
public class TaskRunComponent {

    private final TaskRunRepository taskRunRepository;
    @BeforeTask
    public void init(TaskExecution taskExecution) {
        String execDate = LocalDateTime.now().toString();
        this.taskRunRepository.save(new TaskRunOutPut(null,"Executed at " + execDate));
        log.info("Executed at : " + execDate);
    }
}
