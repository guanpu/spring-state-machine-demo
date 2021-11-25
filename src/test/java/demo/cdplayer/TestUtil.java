package demo.cdplayer;

import org.springframework.statemachine.StateMachine;
import reactor.test.StepVerifier;

public class TestUtil {
    public static <S, E> void doStartAndAssert(StateMachine<S, E> stateMachine) {
        StepVerifier.create(stateMachine.startReactively()).expectComplete().verify();
    }

    public static <S, E> void doStopAndAssert(StateMachine<S, E> stateMachine) {
        StepVerifier.create(stateMachine.stopReactively()).expectComplete().verify();
    }
}
