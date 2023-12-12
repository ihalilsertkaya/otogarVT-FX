package com.halil.otogarvt;

import databaseConnector.DBConnect;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginController {

    Connection connection = DBConnect.getConnection();

    Statement st = null;

    ResultSet set = null;

    @FXML
    private Label sifremiUnuttumLabel;
    @FXML
    private Button girisYap;
    @FXML
    private TextField kullaniciAdiField;
    @FXML
    private PasswordField sifreField;



    public void GirisYap(){
        String kullaniciAdi = kullaniciAdiField.getText();
        String sifre = sifreField.getText();
        try {
            String query = "SELECT * FROM [otobusTerminali].[dbo].[Yetkili] where kullaniciAdi='"+kullaniciAdi+"'and sifre='"+sifre+"'";
            st = connection.createStatement();
            set = st.executeQuery(query);
            if(set.next()){
                System.out.println("Giriş Başarılı");
                int yazhane = set.getInt("yazhaneID");
                switch (yazhane){
                    case 1:
                        SceneManager.getInstance().loadScene("yonetimArayuz.fxml");
                        break;

                    case 2:
                        SceneManager.getInstance().loadScene("yonetimArayuz.fxml");
                        SceneManager.getInstance().changeBackgroundColor("orange");
                        System.out.println("2. yazhane acildi");
                        break;
                    default:
                        //buraya uyarı penceresi olustur
                }
            }
            else{
                //buraya da uyarı olustur
            }


        }catch (Exception e){
            System.out.println("Sorun oluştu.");
            e.printStackTrace();
        }


    }




    }


