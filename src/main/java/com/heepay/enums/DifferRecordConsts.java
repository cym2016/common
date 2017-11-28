package com.heepay.enums;

public enum DifferRecordConsts {

    RJCK("RJCK", "入金长款"),
    CJDK("CJDK", "出金短款"),
    JECY("JECY", "金额差异"),
    DJDS("DJDS", "单据丢失"),

    SUPPLE("SUPPLE", "补单"),

    PENDING("PENDIN", "待处理"),
    FINISH("FINISH", "处理完成"),

    DIFFER("DIFFER", "差异处理平台"),
    COMPLAINT("COMPLA", "投诉处理平台");

    private String value;
    private String content;

    DifferRecordConsts(String value, String content) {
        this.value = value;
        this.content = content;
    }

    public String getValue() {
        return value;
    }

    public String getContent() {
        return content;
    }

}
