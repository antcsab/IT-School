package session_13_abstarction.practice.data_information_system;

import java.util.List;

public class PdfReport extends Report implements PdfExportable {

    public PdfReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void exportTOPdf() {
        //code goes here
    }

    @Override
    public void showPreview() {

    }
}
