package com.example.search_device;

public class Victime {
    private String NumSerie;
    private String Email;
    private  String Marque;
    private String NomProprio;
    private long NumTel;
    private String DatePerte;

    public Victime(String numSerie, String Email, String marque, String nomProprio, Long numTel, String datePerte) {
        this.NumSerie = numSerie;
        this.Email= Email;
        this.Marque = marque;
        this.NomProprio = nomProprio;
        this.NumTel = numTel;
        this.DatePerte = datePerte;
    }
        // Getters et Setters
        //----------------------------------------------------------------------------------
        public String getNumSerie () {
            return NumSerie;
        }
        public void setNumSerie (String numSerie){
            this.NumSerie = numSerie;
        }

        //----------------------------------------------------------------------------------
        public String getEmail () {
            return Email;
        }
        public void setEmail (String Email){
            this.Email = Email;
        }

        //----------------------------------------------------------------------------------
        public String getMarque () {
            return Marque;
        }
        public void setMarque (String marque){
            this.Marque = marque;
        }

        //----------------------------------------------------------------------------------
        public String getNomProprio () {
            return NomProprio;
        }
        public void setNomProprio (String nomProprio){
            this.NomProprio = nomProprio;
        }

        //----------------------------------------------------------------------------------
        public String getDatePerte () {
            return DatePerte;
        }
        public void setDatePerte (String datePerte){
            this.DatePerte = datePerte;
        }

        //----------------------------------------------------------------------------------
        public long getNumTel () {
            return NumTel;
        }

        public void setNumTel ( long numTel){
            this.NumTel = numTel;
        }
} //----------------------------------------------------------------------------------

