package com.xue.client.util;


import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 导出Excel
 * @author QSNP253
 */

@Component
public class CreatExcle {

    public void writeExcel(HashMap<String,HashMap<String, List<String>>> inputMap) throws Exception {

        //HSSFWorkbook wb = new HSSFWorkbook();

        HSSFWorkbook wb = HSSFWorkbookFactory.createWorkbook();

        //生成sheet对象
        //HSSFSheet sheet1 = wb.createSheet("sheet1");

        //创建row对象
        //HSSFRow row0 = sheet1.createRow(0);

        //生成列
        //HSSFCell cell0 = row0.createCell(0);
        //HSSFCell cell1 = row0.createCell(1);
        //HSSFCell cell2 = row0.createCell(2);
        //HSSFCell cell3 = row0.createCell(3);

        //进行赋值
        //cell0.setCellValue("姓名");
        //cell1.setCellValue("年龄");
        //cell2.setCellValue("地址");
        //cell3.setCellValue("电话");


        List<String> channelList = new ArrayList<>();
        channelList.add("BA");
        channelList.add("CA");
        channelList.add("CB");
        channelList.add("DB");
        channelList.add("EC");
        channelList.add("GA");
        channelList.add("GB");
        channelList.add("GP");
        channelList.add("KA");
        channelList.add("RA");
        channelList.add("TM");

        HSSFCellStyle style = wb.createCellStyle();
        style.setWrapText(true);

        //style.setFillForegroundColor(IndexedColors.CORNFLOWER_BLUE.getIndex());// 设置背景色
        //style.setFillBackgroundColor(IndexedColors.CORNFLOWER_BLUE.getIndex());
        HSSFFont font = wb.createFont();
        //font.setFontName("黑体");
        font.setBold(true);
        //font.setFontHeightInPoints((short) 12);//设置字体大小
        style.setFont(font);

        for (String channel: channelList) {
            HSSFSheet sheet1 = wb.createSheet(channel);
            sheet1.setColumnWidth(0,20 * 256);
            AtomicInteger i = new AtomicInteger(1);
            AtomicInteger n = new AtomicInteger(1);
            HSSFRow row0 = sheet1.createRow(i.get()-1);
            row0.setRowStyle(style);
            row0.setHeightInPoints(30);
            HSSFCell row0Cell0 = row0.createCell(0);
            row0Cell0.setCellValue(new HSSFRichTextString("主险\n   附加险"));
            List<String> row0List = new ArrayList<>();
            inputMap.forEach((item,tempMap)->{
                if(null!=tempMap.get(item)){
                    if(tempMap.get(item).contains(channel)){
                        HSSFRow row = sheet1.createRow(i.get());
                        HSSFCell cell0 = row.createCell(0);
                        cell0.setCellStyle(style);
                        cell0.setCellValue(item);
                        tempMap.forEach((k,v)->{
                            if(!k.equals(item)){
                                if(!row0List.contains(k)){
                                    row0List.add(k);
                                    HSSFCell cell = row0.createCell(n.get());
                                    cell.setCellStyle(style);
                                    cell.setCellValue(k);
                                    n.getAndIncrement();
                                }
                                HSSFCell cell = row.createCell(row0List.indexOf(k)+1);
                                if(v.contains(channel)){
                                    cell.setCellValue("YES");
                                }else{
                                    cell.setCellValue("NO");
                                }
                            }
                        });
                        i.getAndIncrement();
                    }
                }else{
                    System.out.println(item);
                }
            });

        }

        //输出excel文件
        FileOutputStream fileOut = new FileOutputStream("D:/workbook.xls");
        wb.write(fileOut);
    }

}
