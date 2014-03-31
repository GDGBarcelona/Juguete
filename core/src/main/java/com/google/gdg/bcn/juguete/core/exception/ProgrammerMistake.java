package com.google.gdg.bcn.juguete.core.exception;


public class ProgrammerMistake extends RuntimeException {

    public ProgrammerMistake(String detailMessage) {
        super(
                "A programmer made a mistake, " +
                        "allowing this to happen: " + detailMessage);
    }

    public ProgrammerMistake(
            String detailMessage, Throwable throwable
    ) {
        super(
                "A programmer made a mistake, " +
                        "allowing this to happen: " + detailMessage,
                throwable);
    }

    public ProgrammerMistake(Throwable throwable) {
        super(throwable);
    }
}
