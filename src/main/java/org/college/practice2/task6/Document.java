package org.college.practice2.task6;

public class Document {
    private String documentName;
    private String documentContent;
    private String signatory;
    private String type;

    public Document(String documentName, String documentContent, String signatory, String type) {
        this.documentName = documentName;
        this.documentContent = documentContent;
        this.signatory = signatory;
        this.type = type;
    }

    public String getDocumentName() {
        return documentName;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public String getSignatory() {
        return signatory;
    }

    public String getType() {
        return type;
    }

}
