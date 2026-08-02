package org.example.service;

import org.example.dao.ItemReportDAO;
import org.example.model.ItemReport;

public class ItemReportService {

    private static ItemReportDAO itemReportDAO = new ItemReportDAO();

    public static boolean reportLostItem(ItemReport item) {

        return itemReportDAO.reportLostItem(item);

    }

}