package session_13_abstarction.practice.data_information_system;

import java.util.List;

public class CsvReport extends Report implements CsvExportable {

    public CsvReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void exportToCsv() {

    }

    @Override
    public void showPreview() {

    }
}
