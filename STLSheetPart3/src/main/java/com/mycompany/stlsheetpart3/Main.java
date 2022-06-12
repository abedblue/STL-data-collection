/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stlsheetpart3;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Abe
 */
public class Main {
    
    public static void main(String args[]) throws IOException
    {
        String myResult = readFile("stldailydata.txt", Charset.defaultCharset());
        System.out.println(myResult);
        
        LinkedList<String[][]> myGames = new LinkedList();
        int currentStart = 135;
        boolean hasfinished = false;
        int i = 0;
        String[][] playerValues = new String[40][10];
        
        while(!hasfinished)
        {
            System.out.println("substring start" + myResult.indexOf("<playerMatchDetails>", currentStart));
            System.out.println("substring end" + myResult.indexOf("</playerMatchDetails>", currentStart + 2000));
            if(myResult.indexOf("<playerMatchDetails>", currentStart) == -1)
            {
                hasfinished = true;
                break;
            }
            
            String currentPlayer = myResult.substring(myResult.indexOf("<playerMatchDetails>", currentStart), myResult.indexOf("</playerMatchDetails>", (myResult.indexOf("<playerMatchDetails>", currentStart))));
            String Assists = currentPlayer.substring(currentPlayer.indexOf("<Assists>"), currentPlayer.indexOf("</Assists>"));            
            playerValues[0][i] = Assists;
            try{
            String ban1 = currentPlayer.substring(currentPlayer.indexOf("<Ban1>"), currentPlayer.indexOf("</Ban1>"));            
            playerValues[1][i] = ban1;
            }
            catch(Exception e)
            {
                playerValues[1][i] = "";
            }
            try{
            String ban2 = currentPlayer.substring(currentPlayer.indexOf("<Ban2>"), currentPlayer.indexOf("</Ban2>"));
            playerValues[2][i] = ban2;
            }
            catch(Exception e)
            {
                playerValues[2][i] = "";
            }
            try{
            String ban3 = currentPlayer.substring(currentPlayer.indexOf("<Ban3>"), currentPlayer.indexOf("</Ban3>"));
            playerValues[3][i] = ban3;
            }
            catch(Exception e)
            {
                playerValues[3][i] = "";
            }
            try{
            String ban4 = currentPlayer.substring(currentPlayer.indexOf("<Ban4>"), currentPlayer.indexOf("</Ban4>"));
            playerValues[4][i] = ban4;
            }
            catch(Exception e)
            {
                playerValues[4][i] = "";
            }
            try{
            String ban5 = currentPlayer.substring(currentPlayer.indexOf("<Ban5>"), currentPlayer.indexOf("</Ban5>"));
            playerValues[5][i] = ban5;
            }
            catch(Exception e)
            {
                playerValues[5][i] = "";
            }
            try{
            String ban6 = currentPlayer.substring(currentPlayer.indexOf("<Ban6>"), currentPlayer.indexOf("</Ban6>"));
            playerValues[6][i] = ban6;
            }
            catch(Exception e)
            {
                playerValues[6][i] = "";
            }
            try{
            String ban7 = currentPlayer.substring(currentPlayer.indexOf("<Ban7>"), currentPlayer.indexOf("</Ban7>"));
            playerValues[7][i] = ban7;
            }
            catch(Exception e)
            {
                playerValues[7][i] = "";
            }
            try{
            String ban8 = currentPlayer.substring(currentPlayer.indexOf("<Ban8>"), currentPlayer.indexOf("</Ban8>"));
            playerValues[8][i] = ban8;
            }
            catch(Exception e)
            {
                playerValues[8][i] = "";
            }
            try{
            String ban9 = currentPlayer.substring(currentPlayer.indexOf("<Ban9>"), currentPlayer.indexOf("</Ban9>"));
            playerValues[9][i] = ban9;
            }
            catch(Exception e)
            {
                playerValues[9][i] = "";
            }
            try{
            String ban10 = currentPlayer.substring(currentPlayer.indexOf("<Ban10>"), currentPlayer.indexOf("</Ban10>"));
            playerValues[10][i] = ban10;
            }
            catch(Exception e)
            {
                playerValues[10][i] = "";
            }
            String deaths = currentPlayer.substring(currentPlayer.indexOf("<Deaths>"), currentPlayer.indexOf("</Deaths>"));
            playerValues[11][i] = deaths;        
            String distanced_traveled = currentPlayer.substring(currentPlayer.indexOf("<Distance_Traveled>"), currentPlayer.indexOf("</Distance_Traveled>"));
            playerValues[12][i] = distanced_traveled;
            String gold_earned = currentPlayer.substring(currentPlayer.indexOf("<Gold_Earned>"), currentPlayer.indexOf("</Gold_Earned>"));
            playerValues[13][i] = gold_earned;
            String gpm = currentPlayer.substring(currentPlayer.indexOf("<Gold_Per_Minute>"), currentPlayer.indexOf("</Gold_Per_Minute>"));
            playerValues[14][i] = gpm;
            try{
                String active1 = currentPlayer.substring(currentPlayer.indexOf("<Item_Active_1>"), currentPlayer.indexOf("</Item_Active_1>"));
                playerValues[15][i] = active1;
            }
            catch(Exception e)
            {
                playerValues[15][i] = "";
            }
            try{
            String active2 = currentPlayer.substring(currentPlayer.indexOf("<Item_Active_2>"), currentPlayer.indexOf("</Item_Active_2>"));            
            playerValues[16][i] = active2;
            }
            catch(Exception e)
            {
                playerValues[16][i] = "";
            }
            try{
            String item1 = currentPlayer.substring(currentPlayer.indexOf("<Item_Purch_1>"), currentPlayer.indexOf("</Item_Purch_1>"));
            playerValues[17][i] = item1;
            }
            catch(Exception e)
            {
                playerValues[17][i] = "";
            }
            try{
            String item2 = currentPlayer.substring(currentPlayer.indexOf("<Item_Purch_2>"), currentPlayer.indexOf("</Item_Purch_2>"));
            playerValues[18][i] = item2;
            }
            catch(Exception e)
            {
                playerValues[18][i] = "";
            }
            try{
            String item3 = currentPlayer.substring(currentPlayer.indexOf("<Item_Purch_3>"), currentPlayer.indexOf("</Item_Purch_3>"));
            playerValues[19][i] = item3;
            }
            catch(Exception e)
            {
                playerValues[19][i] = "";
            }
            try{
            String item4 = currentPlayer.substring(currentPlayer.indexOf("<Item_Purch_4>"), currentPlayer.indexOf("</Item_Purch_4>"));
            playerValues[20][i] = item4;
            }
            catch(Exception e)
            {
                playerValues[20][i] = "";
            }
            try{
            String item5 = currentPlayer.substring(currentPlayer.indexOf("<Item_Purch_5>"), currentPlayer.indexOf("</Item_Purch_5>"));
            playerValues[21][i] = item5;
            }
            catch(Exception e)
            {
                playerValues[21][i] = "";
            }
            try{
            String item6 = currentPlayer.substring(currentPlayer.indexOf("<Item_Purch_6>"), currentPlayer.indexOf("</Item_Purch_6>"));
            playerValues[22][i] = item6;
            }
            catch(Exception e)
            {
                playerValues[22][i] = "";
            }
            String killing_sprees = currentPlayer.substring(currentPlayer.indexOf("<Killing_Spree>"), currentPlayer.indexOf("</Killing_Spree>"));
            playerValues[23][i] = killing_sprees;
            String double_kills = currentPlayer.substring(currentPlayer.indexOf("<Kills_Double>"), currentPlayer.indexOf("</Kills_Double>"));
            playerValues[24][i] = double_kills;
            String fg_kills = currentPlayer.substring(currentPlayer.indexOf("<Kills_Fire_Giant>"), currentPlayer.indexOf("</Kills_Fire_Giant>"));
            playerValues[25][i] = fg_kills;
            String first_bloods = currentPlayer.substring(currentPlayer.indexOf("<Kills_First_Blood>"), currentPlayer.indexOf("</Kills_First_Blood>"));
            playerValues[26][i] = first_bloods;
            String gf_kills = currentPlayer.substring(currentPlayer.indexOf("<Kills_Gold_Fury>"), currentPlayer.indexOf("</Kills_Gold_Fury>"));
            playerValues[27][i] = gf_kills;
            String penta_kills = currentPlayer.substring(currentPlayer.indexOf("<Kills_Penta>"), currentPlayer.indexOf("</Kills_Penta>"));
            playerValues[28][i] = penta_kills;
            String phoenix_kills = currentPlayer.substring(currentPlayer.indexOf("<Kills_Phoenix>"), currentPlayer.indexOf("</Kills_Phoenix>"));
            playerValues[29][i] = phoenix_kills;
            String player_kills = currentPlayer.substring(currentPlayer.indexOf("<Kills_Player>"), currentPlayer.indexOf("</Kills_Player>"));
            playerValues[30][i] = player_kills;
            String quadra_kills = currentPlayer.substring(currentPlayer.indexOf("<Kills_Quadra>"), currentPlayer.indexOf("</Kills_Quadra>"));
            playerValues[31][i] = quadra_kills;
            String single_kills = currentPlayer.substring(currentPlayer.indexOf("<Kills_Single>"), currentPlayer.indexOf("</Kills_Single>"));
            playerValues[32][i] = single_kills;
            String triple_kills = currentPlayer.substring(currentPlayer.indexOf("<Kills_Triple>"), currentPlayer.indexOf("</Kills_Triple>"));
            playerValues[33][i] = triple_kills;
            String tower_kills = currentPlayer.substring(currentPlayer.indexOf("<Towers_Destroyed>"), currentPlayer.indexOf("</Towers_Destroyed>"));
            playerValues[34][i] = tower_kills;
            String wards_placed = currentPlayer.substring(currentPlayer.indexOf("<Wards_Placed>"), currentPlayer.indexOf("</Wards_Placed>"));
            playerValues[35][i] = wards_placed;
            
            //System.out.println(currentPlayer);
            try{
            String has_replay = currentPlayer.substring(currentPlayer.indexOf("<hasReplay>"), currentPlayer.indexOf("</hasReplay>"));
                playerValues[36][i] = has_replay;
            }
            catch(Exception e)
            {
                playerValues[36][i] = "n";
            }
            
                
            
            //String player_name = currentPlayer.substring(currentPlayer.indexOf("<playerName>"), currentPlayer.indexOf("</playerName>"));
            //playerValues[37][i] = player_name;
            String god_name = currentPlayer.substring(currentPlayer.indexOf("<Reference_Name>"), currentPlayer.indexOf("</Reference_Name>"));
            playerValues[37][i] = god_name;
            String dateTime = currentPlayer.substring(currentPlayer.indexOf("<Entry_Datetime>"), currentPlayer.indexOf("</Entry_Datetime>"));
            playerValues[38][i] = dateTime;
            String match_id = currentPlayer.substring(currentPlayer.indexOf("<Match>"), currentPlayer.indexOf("</Match>"));
            playerValues[39][i] = match_id;

            i += 1;
            System.out.println(i);
            
            if(i >= 10)
            {
                i = 0;
                String[][] tempArray = (String[][])copyMyArray(playerValues);
                myGames.add(tempArray);
            }
            //int k = 0; k < 10; k++
            currentStart += (currentPlayer.length() + 20);

            System.out.println("current start: " + currentStart);
            if((myResult.length() - 30) <= currentStart)
            {
                hasfinished = true;
            }          
        }
        
        for(int x = 0; x < myGames.size(); x++)
        {
            for(int k = 0; k < 10; k++)
                {
                    for(int j = 0; j < 40; j++)
                    {
                        System.out.print(myGames.get(x)[j][k] + " ");
                    }
                    System.out.println();
                }
            System.out.println();
        }
        
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("STL Data");
        
        for(int x = 0; x < (myGames.size() * 10) + 1; x++ )
        {
            sheet.createRow(x);
        }
        
        for(int x = 0; x < 40; x++)
        {
            Cell cell = sheet.getRow(0).createCell(x);     
        }
        
        sheet.getRow(0).getCell(0).setCellValue("Assists");
        sheet.getRow(0).getCell(1).setCellValue("Ban1");
        sheet.getRow(0).getCell(2).setCellValue("Ban2");
        sheet.getRow(0).getCell(3).setCellValue("Ban3");
        sheet.getRow(0).getCell(4).setCellValue("Ban4");
        sheet.getRow(0).getCell(5).setCellValue("Ban5");
        sheet.getRow(0).getCell(6).setCellValue("Ban6");
        sheet.getRow(0).getCell(7).setCellValue("Ban7");
        sheet.getRow(0).getCell(8).setCellValue("Ban8");
        sheet.getRow(0).getCell(9).setCellValue("Ban9");
        sheet.getRow(0).getCell(10).setCellValue("Ban10");
        sheet.getRow(0).getCell(11).setCellValue("Deaths");
        sheet.getRow(0).getCell(12).setCellValue("Distance Traveled");
        sheet.getRow(0).getCell(13).setCellValue("Gold Earned");
        sheet.getRow(0).getCell(14).setCellValue("Gold Per Minute");
        sheet.getRow(0).getCell(15).setCellValue("Relic1");
        sheet.getRow(0).getCell(16).setCellValue("Relic2");
        sheet.getRow(0).getCell(17).setCellValue("Item1");
        sheet.getRow(0).getCell(18).setCellValue("Item2");
        sheet.getRow(0).getCell(19).setCellValue("Item3");
        sheet.getRow(0).getCell(20).setCellValue("Item4");
        sheet.getRow(0).getCell(21).setCellValue("Item5");
        sheet.getRow(0).getCell(22).setCellValue("Item6");
        sheet.getRow(0).getCell(23).setCellValue("Killing Sprees");
        sheet.getRow(0).getCell(24).setCellValue("Double Kills");
        sheet.getRow(0).getCell(25).setCellValue("Fire Giant Kills");
        sheet.getRow(0).getCell(26).setCellValue("First Bloods");
        sheet.getRow(0).getCell(27).setCellValue("Gold Fury Kills");
        sheet.getRow(0).getCell(28).setCellValue("Penta Kills");
        sheet.getRow(0).getCell(29).setCellValue("Phoenix Kills");
        sheet.getRow(0).getCell(30).setCellValue("Player Kills");
        sheet.getRow(0).getCell(31).setCellValue("Quadra Kills");
        sheet.getRow(0).getCell(32).setCellValue("Single Kills");
        sheet.getRow(0).getCell(33).setCellValue("Triple Kills");
        sheet.getRow(0).getCell(34).setCellValue("Tower Kills");
        sheet.getRow(0).getCell(35).setCellValue("Wards Placed");
        sheet.getRow(0).getCell(36).setCellValue("Has Replay");
        sheet.getRow(0).getCell(37).setCellValue("God");
        sheet.getRow(0).getCell(38).setCellValue("Date");
        sheet.getRow(0).getCell(39).setCellValue("Match ID");
        
        for(int x = 0; x < myGames.size(); x++)
        {
            for(int y = 0; y < 10; y++ )
            {
                for(int z = 0; z < 40; z++ )
                {
                    Cell cell = sheet.getRow((y + (x * 10)) + 1).createCell(z);
                    
                    String toEnter = "";
                    
                    try
                    {
                        toEnter = myGames.get(x)[z][y].substring(myGames.get(x)[z][y].indexOf(">") + 1);
                    }
                    catch(Exception e)
                    {
                    
                    }
                    cell.setCellValue(toEnter);
                }
            }
        }
        
        try {
            FileOutputStream outputStream = new FileOutputStream("STL Output.xlsx");
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //split into sections beginning with <playermatchdetails> and ending with </playermatchdetails>, parse substrings with an intager variable, currentstart
        //once in smaller substrings, individual attributes can be found by tag easily
        //data will be stored in a Linkedlist of 2d arrays until transplanted into the output sheet
    }
    
    static String readFile(String path, Charset encoding)
    throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
    
    static Object copyMyArray(String[][] myArray)
    {
        String[][] myReturn = new String[40][10];
        
        for(int i = 0; i < 40; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                myReturn[i][j] = myArray[i][j];
            }
        }
        
        return myReturn;
    }
    
}
