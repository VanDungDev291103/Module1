package ss4_java_overview_stringbuilder_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Question2 {
    public static void main(String[] args) throws ParseException {
        //a. chuển chuỗi "02/28/2023" sang kiểu java.util.date
        String dateStr = "02/28/2023";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sdf.parse(dateStr);
        System.out.println("java.util.date: " + date);

        //b. chuyển ngày tháng hiện tại (của hệ thống) đang ở kiểu java.util.date sang kiểu String theo định dạng dd/MM/yyyy
        // và hiện thị ra màn hình
        Date currentDate = new Date();// lấy ra ngày hiện tại
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("ngày đã chuyển sang kiểu String: " + formattedDate);

        //c. chuyển chuỗi "02/28/2023" sang kểu LocalDate
        String dateStr2 = "02/28/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(dateStr2, formatter);
        System.out.println("LocalDate: " + localDate);

        //d. chuyển ngày hện tại(của hệ thống) đang ở kiểu LocalDate sang kiểu String theo định dạng dd/MM/YYYY và hiện thị ra màn hình
        LocalDate currentDate2 = LocalDate.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate2 = currentDate2.format(formatter2);
        System.out.println("ngày đã định dạng: " + formattedDate2);

        //e. lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống
        LocalDateTime localDateTime = LocalDateTime.now();// lấy ra ngày tháng hiện tại
        int day = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        System.out.println("Ngày: " + day);
        System.out.println("Tháng: " + month);
        System.out.println("năm: " + year);
        System.out.println("giờ: " + hour);
        System.out.println("phút: " + minute);
        System.out.println("giây: " + second);

        //f. hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rời vào thứ mấy trong tuần, và cách ngày hiện tại bao nhiêu ngày?
        LocalDate currentDate3 = LocalDate.now();//lấy ngày hện tại

        //tính ngày 1 tháng sau hiện tại
        LocalDate oneMonthLater = currentDate3.plusMonths(1);

        //In ra thứ mấy trong tuần sau 1 tháng
        System.out.println("Một tháng sau sẽ rơi vào thứ mấy: " + oneMonthLater.getDayOfWeek());

        //tính số ngày chênh lệch giữa ngày hiện tại và ngày 1 tháng sau , ChronoUnit.DAYS: tính ngày chênh lệch giữa 2 thời diểm
        long daysUntilOneMonthLater = currentDate3.until(oneMonthLater, ChronoUnit.DAYS);

        System.out.println("Một tháng sau:  " + oneMonthLater);

        //in ra số ngày chênh lệch giữa ngày hiện tại và 1 tháng sau
        System.out.println("số ngày lệch với 1 tháng sau: " + daysUntilOneMonthLater);


        //g. hãy cho biết cách đây 1000 ngày(tính từ ngày hiện tại) là ngày tháng năm nào
        LocalDate currentDate4 = LocalDate.now();
        LocalDate futureDate = currentDate4.plusDays(1000);
        System.out.println("Ngày tương lai cách đây 1000 ngày: " + futureDate);

        //h. hãy nhập vào String có định dạng là dd/MM/yyyy. hãy chuyển thành 2 biến kiểu LocalDate. sau đó hãy tính số ngày chênh lệch giữa 2 ngày đã nhập
        String date1 = "29/11/2024";
        String date2 = "29/12/2024";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(date1, formatter1);
        LocalDate localDate2 = LocalDate.parse(date2, formatter2);
        long daysDifference = localDate1.until(localDate2, ChronoUnit.DAYS);
        System.out.println("số ngày chênh lệch: " + daysDifference);

        //i. nhập vào 1 String có định dạng là dd/MM/yyyy/. sau đó nhập vào số tự nhiên n. hãy in ra số ngày đứng sau ngày đã nhập n ngày
        String dateI = "29/11/2024";
        int n = 10;
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate3 = LocalDate.parse(dateI, formatter3);
        LocalDate futureDate3 = localDate3.plusDays(n);
        System.out.println("ngày sau " + n + " ngày: " + futureDate3.format(formatter3));
    }
}
