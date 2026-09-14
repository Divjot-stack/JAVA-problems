interface Confidential {
}

class Document {
    String documentName;

    Document(String documentName) {
        this.documentName = documentName;
    }

    void display() {
        System.out.println("Document: " + documentName);
    }
}

class PublicDocument extends Document {
    PublicDocument(String documentName) {
        super(documentName);
    }
}

class EmployeeDocument extends Document implements Confidential {
    EmployeeDocument(String documentName) {
        super(documentName);
    }
}

class FinancialDocument extends Document implements Confidential {
    FinancialDocument(String documentName) {
        super(documentName);
    }
}

public class DocumentDemo {
    public static void main(String[] args) {

        Document[] documents = {
            new PublicDocument("Company Brochure"),
            new EmployeeDocument("Employee Salary Details"),
            new FinancialDocument("Financial Report")
        };

        for (Document document : documents) {
            document.display();

            if (document instanceof Confidential) {
                System.out.println("Confidential: Yes");
            } else {
                System.out.println("Confidential: No");
            }

            System.out.println();
        }
    }
}