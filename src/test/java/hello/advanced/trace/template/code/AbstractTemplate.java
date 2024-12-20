package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {

    public void execute() {
        long statTime = System.currentTimeMillis();
        //비즈니스 로직 실행
//        log.info("비즈니스 로직1 실행");
        call();
        //비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - statTime;
        log.info("resultTime={}", resultTime);
    }

    protected abstract void call();
}
