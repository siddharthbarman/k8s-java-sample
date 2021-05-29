package com.sbytestream.adder.models;

public class CalculationResponse {
    public CalculationResponse() {}

    public CalculationResponse(int op1, int op2, String operation, int answer, String responder) {
        this.op1 = op1;
        this.op2 = op2;
        this.operation = operation;
        this.answer = answer;
        this.responder = responder;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getResponder() {
        return responder;
    }

    public void setResponder(String responder) {
        this.responder = responder;
    }

    private int op1;
    private int op2;
    private int answer;
    private String operation;
    private String responder;
}
