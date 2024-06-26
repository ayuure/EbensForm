package com.example.ebensfrom;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class formAutomation {

    public int randomGen(int num){
        Random random = new Random();
        int randomNumber = random.nextInt(num);
        return randomNumber;
    }


    public formAutomation visitUrl(){
        Selenide.open("https://docs.google.com/forms/d/e/1FAIpQLSf1FscS84VVLfPxiaYPYf9HllxLyn5ApGEr7ocN4zKxagLLHw/viewform");
        return this;
    }

    public SelenideElement ageField(){
        return $("div[role='list'] div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) input:nth-child(1)");


    }
    public SelenideElement MaleSex(){
        return $("div[id='i9'] div[class='AB7Lab Id5V1']");
    }



    public SelenideElement femaleSex(){
        return $("div[id='i12']");

    }

    public void sexList() {
        List<SelenideElement> sex = new ArrayList<SelenideElement>();
        sex.add(MaleSex());
        sex.add(femaleSex());
        sex.get(randomGen(2)).click();
    }
    public SelenideElement christianReligion(){
        return $("div[id='i19'] div[class='AB7Lab Id5V1']");
    }

    public SelenideElement islamReligion(){
        return $("div[id='i22']");
    }
    public SelenideElement africanRegion(){
        return $("div[id='i25']");
    }
    public SelenideElement otherReligion(){
        return $("div[id='i28']");

    }
    public void religionList() {
        List<SelenideElement> religion = new ArrayList<SelenideElement>();
        religion.add(christianReligion());
        religion.add(islamReligion());
        religion.add(africanRegion());
        //religion.add(otherReligion());
        religion.get(randomGen(3)).click();
    }
    public SelenideElement programOfStudySelector(){
        return $(By.xpath("(//div[@role='option'])[1]"));
    }

    /*public ElementsCollection SelectorsForDropDown(){
        return $$("span[class=\"vRMGwf oJeWuf\"]");
    }


     */
   /* public SelenideElement pharmarcy(){
        return $(By.xpath("(//span[contains(@class,'vRMGwf oJeWuf')][normalize-space()='Pharmacy'])[2]"));
    }

    */

    public SelenideElement ProgramOfStudy(){
        SelenideElement Pharmacy = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > span:nth-child(2)");
        SelenideElement Medicine = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > span:nth-child(2)");
        SelenideElement Medilab = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > span:nth-child(2)");
        SelenideElement Nutrition = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > span:nth-child(2)" );
        SelenideElement BasicEdu = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(7) > span:nth-child(2)");
        SelenideElement DevEdu = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > span:nth-child(2)" );
        SelenideElement SocialScience = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > span:nth-child(2)");
        SelenideElement Nursing = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(10) > span:nth-child(2)");
        SelenideElement publicHealth = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(11) > span:nth-child(2)");
        SelenideElement MedicalImaging = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(12) > span:nth-child(2)");
        SelenideElement Business = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(13) > span:nth-child(2)");
        SelenideElement EarlyChildhood = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(14) > span:nth-child(2)");
        SelenideElement[] arr = new SelenideElement[]{Pharmacy, Medicine, Medilab, Nutrition, BasicEdu, DevEdu, DevEdu, SocialScience, Nursing, publicHealth, MedicalImaging, Business, EarlyChildhood};
        return (arr[randomGen(12)]);
    }
    public SelenideElement studyLevel(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    }

    public SelenideElement LevelOfStudyYear(){
        SelenideElement hundred = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > span:nth-child(2)");
        SelenideElement twoHundred = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > span:nth-child(2)");
        SelenideElement ThreeHundred = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > span:nth-child(2)");
        SelenideElement FourHundred = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > span:nth-child(2)");
        SelenideElement FiveHundred = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(7) > span:nth-child(2)");
        SelenideElement SixHundred = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > span:nth-child(2)");
        SelenideElement[] arr = new SelenideElement[]{hundred, twoHundred, ThreeHundred, FourHundred,FiveHundred, SixHundred};
        return (arr[randomGen(6)]);
    }
    public SelenideElement region(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    }
    public SelenideElement Region(){
        SelenideElement upperEast = $("div[class='MocG8c HZ3kWc mhLiyf OIC90c LMgvRb KKjvXb'] span[class='vRMGwf oJeWuf']");
        SelenideElement upperWest = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > span:nth-child(2)");
        SelenideElement northEast = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > span:nth-child(2)");
        SelenideElement Northern = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > span:nth-child(2)");
        SelenideElement Savannah = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > span:nth-child(2)");
        SelenideElement Volta = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > span:nth-child(2)");
        SelenideElement Oti = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > span:nth-child(2)");
        SelenideElement Western = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(10) > span:nth-child(2)");
        SelenideElement WesternNorth = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(11) > span:nth-child(2)");
        SelenideElement BonoEast = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(12) > span:nth-child(2)");
        SelenideElement BrongAhafo = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(13) > span:nth-child(2)");
        SelenideElement Central = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(14) > span:nth-child(2)");
        SelenideElement Eastern = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(15) > span:nth-child(2)");
        SelenideElement Ahafo = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(16) > span:nth-child(2)");
        SelenideElement[] arr = {upperWest, upperEast, northEast, Northern, Savannah, Volta, Oti, WesternNorth, BrongAhafo, Western, BonoEast, Central, Eastern, Ahafo};
        return (arr[randomGen(14)]);
    }

    public SelenideElement NoneLevelOfEducation(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[7]"));
    }
    public SelenideElement primarySchoolLevelOfEducation(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[8]"));
    }
    public SelenideElement JHSLevelOfEducation(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[9]"));
    }
    public SelenideElement secSchoolEdu(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[10]"));
    }

    public SelenideElement tertiaryLevelEdu(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[11]"));
    }

    public SelenideElement eductionLevelMum(){
        SelenideElement none = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement primarySchool = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement Jhs = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(3) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement Secondary = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(4) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement Tertiary = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(5) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement arr3 []= {none, primarySchool,Jhs, Secondary, Tertiary};
        return(arr3[randomGen(5)]);
    }

    public void EducationLevel() {
        List<SelenideElement> edu = new ArrayList<SelenideElement>();
        edu.add(NoneLevelOfEducation());
        edu.add(primarySchoolLevelOfEducation());
        edu.add(JHSLevelOfEducation());
        edu.add(secSchoolEdu());
        edu.add(tertiaryLevelEdu());
        edu.get(randomGen(4)).click();
    }
    public SelenideElement ruralSettlement(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[17]"));
    }
    public SelenideElement urbanSettlement(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[18]"));
    }
    public void Settlement() {
        List<SelenideElement> settle = new ArrayList<SelenideElement>();
        settle.add(ruralSettlement());
        settle.add(urbanSettlement());
        settle.get(randomGen(2)).click();
    }
    public SelenideElement accomodationSingle(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[19]"));
    }
    public SelenideElement accomodation2Bedroom(){
        return $(By.xpath("//div[@id='i98']//div[@class='AB7Lab Id5V1']"));
    }
    public SelenideElement accomodation3Bedroom(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[21]"));
    }
    public SelenideElement singleRoomAccomodation(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[22]"));
    }
    public SelenideElement chamberAndHall(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[23]"));
    }
    public void accommodation() {
        List<SelenideElement> acc = new ArrayList<SelenideElement>();
        acc.add(accomodationSingle());
        acc.add(accomodation2Bedroom());
        acc.add(accomodation3Bedroom());
        acc.add(singleRoomAccomodation());
        acc.add(chamberAndHall());
        acc.get(randomGen(5)).click();
    }
    public SelenideElement FMTyes(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[24]"));
    }
    public SelenideElement FMTno(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[25]"));
    }
    public void yesNoFMT() {
        List<SelenideElement> FMT = new ArrayList<SelenideElement>();
        FMT.add(FMTyes());
        FMT.add(FMTno());
        int val = randomGen(2);
        if (val == 1){
            FMT.get(val).click();
        }
        else {
            FMT.get(val).click();
            ifYes().val("Faecal Microbiota Transplantation (FMT) is a medical procedure where fecal matter from a healthy donor is transferred to a patient’s gastrointestinal tract. The goal is to restore the healthy microbiota balance in the recipient's gut, which can be disrupted due to various conditions, especially those related to bacterial imbalances or infections");
            SourcesOfDonarFMT().val("Healthy Volunteers,Family Members, Stool Banks");
            conditionsFMT().val("Clostridioides difficile Infection (CDI), Inflammatory Bowel Disease (IBD), Irritable Bowel Syndrome (IBS)");
        }

    }
    public SelenideElement ifYes(){
        return $(By.xpath("(//textarea[@aria-label='Your answer'])[1]"));
    }
    public SelenideElement SourcesOfDonarFMT(){
        return $(By.xpath("(//input[@type='text'])[3]"));
    }
    public SelenideElement conditionsFMT(){
        return $(By.xpath("(//input[@type='text'])[4]"));
    }

    public SelenideElement administerFMT(){
        return $(By.xpath("(//textarea[@aria-label='Your answer'])[2]"));
    }

    public SelenideElement potentionalRisk(){
        return $(By.xpath("(//textarea[@aria-label='Your answer'])[3]"));
    }

    public SelenideElement scaleFMT(){
        SelenideElement zero = $("div[aria-label='0'] div[class='AB7Lab Id5V1']");
        SelenideElement one = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(19) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement two = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(19) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement three = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(19) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement four = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(19) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement five = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(19) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(7) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement six = $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[32]"));
        SelenideElement[] arr = new SelenideElement[]{zero, one, two, three, four, five, six};
        return (arr[randomGen(6)]);
    }

    public SelenideElement FMTHealthCareStrong(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[37]"));
    }

    public SelenideElement FMTAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[38]"));
    }
    public SelenideElement FMTDisagree(){
        return $(By.xpath("//div[@id='i154']//div[contains(@class,'AB7Lab Id5V1')]"));
    }

    public SelenideElement FMTStronglyDisagree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[40]"));
    }
    public void recFMT() {
        List<SelenideElement> recFMT = new ArrayList<SelenideElement>();
        recFMT.add(FMTHealthCareStrong());
        recFMT.add(FMTAgree());
        recFMT.add(FMTDisagree());
        recFMT.add(FMTStronglyDisagree());
        recFMT.get(randomGen(4)).click();
    }
    public SelenideElement influence(){
        return $(By.xpath("(//textarea[contains(@aria-label,'Your answer')])[4]"));
    }
    public SelenideElement Verycomfort()
    {
       return $(By.xpath("(//textarea[contains(@aria-label,'Your answer')])[4]"));
    }

    public SelenideElement comfort()
    {
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[46]"));
    }
    public SelenideElement Uncomfort()
    {
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[47]"));
    }
    public SelenideElement VeryUncomfort()
    {
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[48]"));
    }
    public void ComfortLevel() {
        List<SelenideElement> ComfortLevel = new ArrayList<SelenideElement>();
        ComfortLevel.add(Verycomfort());
        ComfortLevel.add(comfort());
        ComfortLevel.add(Uncomfort());
        ComfortLevel.add(VeryUncomfort());
        ComfortLevel.get(randomGen(4)).click();
    }

    public SelenideElement FaecalVeryComfort()
    {
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[49]"));
    }
    public SelenideElement FaecalComfort()
    {
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[50]"));
    }
    public SelenideElement FaecalUnComfort()
    {
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[51]"));
    }
    public SelenideElement FaecalVeryUnComfort()
    {
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[52]"));
    }

    public void FaecalCom() {
        List<SelenideElement> FaecalComfort = new ArrayList<SelenideElement>();
        FaecalComfort.add(FaecalComfort());
        FaecalComfort.add(FaecalUnComfort());
        FaecalComfort.add(FaecalVeryUnComfort());
        FaecalComfort.add(FaecalVeryComfort());
        FaecalComfort.get(randomGen(4)).click();
    }


    public SelenideElement BenefitsStrongly(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[53]"));
    }
    public SelenideElement BenefitsAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[54]"));
    }
    public SelenideElement BenefitsDisagree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[55]"));
    }
    public SelenideElement BenefitsStronglyDisagree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[56]"));
    }

    public void Benefits() {
        List<SelenideElement> Benefits = new ArrayList<SelenideElement>();
        Benefits.add(BenefitsStrongly());
        Benefits.add(BenefitsAgree());
        Benefits.add(BenefitsDisagree());
        Benefits.add(BenefitsStronglyDisagree());
        Benefits.get(randomGen(4)).click();
    }

    public SelenideElement MedicinePropertyStrongAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[57]"));
    }
    public SelenideElement MedicinePropertyAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[58]"));
    }
    public SelenideElement MedicinePropertyDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[59]"));
    }
    public SelenideElement MedicinePropertyStrongDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[60]"));
    }

    public void Medicine() {
        List<SelenideElement> Medicine = new ArrayList<SelenideElement>();
        Medicine.add(MedicinePropertyStrongAgree());
        Medicine.add(MedicinePropertyAgree());
        Medicine.add(MedicinePropertyDisAgree());
        Medicine.add(MedicinePropertyStrongDisAgree());
        Medicine.get(randomGen(4)).click();
    }

    public SelenideElement DisgustingFaecalMatterStronglyAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[61]"));

    }

    public SelenideElement DisgustingFaecalMatterAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[62]"));

    }
    public SelenideElement DisgustingFaecalMatterDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[63]"));

    }
    public SelenideElement DisgustingFaecalMatterStronglyDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[64]"));

    }
    public void Disgust() {
        List<SelenideElement> Disgust = new ArrayList<SelenideElement>();
        Disgust.add(DisgustingFaecalMatterStronglyAgree());
        Disgust.add(DisgustingFaecalMatterAgree());
        Disgust.add(DisgustingFaecalMatterDisAgree());
        Disgust.add(DisgustingFaecalMatterStronglyDisAgree());
        Disgust.get(randomGen(4)).click();
    }

    public SelenideElement scaleCulturalAcceptance(){
        SelenideElement one = $(By.xpath("(//div)[1208]"));
        SelenideElement two = $(By.xpath("(//div)[1217]"));
        SelenideElement three = $(By.xpath("(//div)[1226]"));
        SelenideElement four = $(By.xpath("(//div)[1235]"));
        SelenideElement five = $(By.xpath("(//div)[1243]"));
        SelenideElement[] arr = new SelenideElement[]{one, two, three, four, five};
        return (arr[randomGen(5)]);
    }

    public SelenideElement scaleAcceptance(){
        SelenideElement one = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement two = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement three = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement four = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement five = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)");
        SelenideElement[] arr = new SelenideElement[]{one, two, three, four, five};
        return (arr[randomGen(5)]);
    }

    public SelenideElement intergrationYes(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[70]"));
    }
    public SelenideElement intergrationNo(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[71]"));
    }
    public void IntegrateYesNo() {
        List<SelenideElement> IntegrateYesNo = new ArrayList<SelenideElement>();
        IntegrateYesNo.add(intergrationYes());
        IntegrateYesNo.add(intergrationNo());
        IntegrateYesNo.get(randomGen(2)).click();
    }
    public SelenideElement acceptFaecalMatter(){
        return $(By.xpath("(//textarea[contains(@aria-label,'Your answer')])[5]"));
    }

    public SelenideElement DYKAnimalExcerementYes(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[72]"));

    }
    public SelenideElement DYKAnimalExcerementNo(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[73]"));

    }
    public void DYKANIMAL() {
        List<SelenideElement> DYKANIMAL = new ArrayList<SelenideElement>();
        DYKANIMAL.add(DYKAnimalExcerementYes());
        DYKANIMAL.add(DYKAnimalExcerementNo());
        DYKANIMAL.get(randomGen(2)).click();
    }

    public SelenideElement doYouUseAnimalExcretementYes(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[74]"));

    }
    public SelenideElement doYouUseAnimalExcretementNo(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[75]"));

    }
    public void DoYouUse() {
        List<SelenideElement> DoYouUse = new ArrayList<SelenideElement>();
        DoYouUse.add(doYouUseAnimalExcretementYes());
        DoYouUse.add(doYouUseAnimalExcretementNo());

        int val = randomGen(2);
        if (val == 1) {
            DoYouUse.get(val).click();
        }
        else {
            DoYouUse.get(val).click();
            AnimalExcrementIfYes().val("Cow Dung,Goat Droppings, Sheep Manure");
            recomendedToYou().val("Friend and Local Herbalist");
        }
    }
    public SelenideElement AnimalExcrementIfYes(){
        return $(By.xpath("(//input[contains(@type,'text')])[5]"));
    }
    public SelenideElement recomendedToYou(){
        return $(By.xpath("(//input[@type='text'])[6]"));
    }



    public SelenideElement recentlyUsed(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[76]"));
    }
    public SelenideElement spiritualUsed(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[77]"));
    }
    public SelenideElement Both(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[78]"));
    }

    public void Use() {
        List<SelenideElement> use = new ArrayList<SelenideElement>();
        use.add(recentlyUsed());
        use.add(spiritualUsed());
        use.add(Both());
        use.get(randomGen(3)).click();
    }
    public SelenideElement PurposeYouUsed(){
        return $(By.xpath("(//input[contains(@type,'text')])[7]"));
    }
    public SelenideElement LevelVerySatified(){
        return $(By.xpath("(//div[@class='AB7Lab Id5V1'])[79]"));
    }

    public SelenideElement LevelSatified(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[80]"));
    }
    public SelenideElement LevelDisSatified(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[81]"));
    }
    public SelenideElement LevelVeryDiSatified(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[82]"));
    }
    public void LevelOfSatisfaction() {
        List<SelenideElement> uses = new ArrayList<SelenideElement>();
        uses.add(LevelVerySatified());
        uses.add(LevelSatified());
        uses.add(LevelDisSatified());
        uses.add(LevelVeryDiSatified());
        uses.get(randomGen(4)).click();
    }

    public SelenideElement DYKAnyoneThatHasUsedYes(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[83]"));
    }

    public SelenideElement DYKAnyoneThatHasUsedNo(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[84]"));
    }

    public void Satsss() {
        List<SelenideElement> Satsss = new ArrayList<SelenideElement>();
        Satsss.add(DYKAnyoneThatHasUsedYes());
        Satsss.add(DYKAnyoneThatHasUsedNo());
        int val = randomGen(2);
        if (val == 1) {
            Satsss.get(val).click();
        }
        else
        {
            Satsss.get(val).click();
            SatsssOptional();

        }
    }
    public SelenideElement ifYesVerySatisfiedOptional(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[85]"));
    }

    public SelenideElement ifYesSatisfiedOptional(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[86]"));
    }
    public SelenideElement ifYesDisSatisfiedOptional(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[87]"));
    }
    public SelenideElement ifYesVeryDisSatisfiedOptional(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[88]"));
    }
    public void SatsssOptional() {
        List<SelenideElement> SatsssOptional = new ArrayList<SelenideElement>();
        SatsssOptional.add(ifYesVerySatisfiedOptional());
        SatsssOptional.add(ifYesSatisfiedOptional());
        SatsssOptional.add(ifYesDisSatisfiedOptional());
        SatsssOptional.add(ifYesVeryDisSatisfiedOptional());
        SatsssOptional.get(randomGen(4)).click();
    }

    public SelenideElement ConsiderTraditionalMediceStronglyAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[89]"));
    }
    public SelenideElement ConsiderTraditionalMediceAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[90]"));
    }
    public SelenideElement ConsiderTraditionalMediceDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[91]"));
    }
    public SelenideElement ConsiderTraditionalMediceStronglyDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[92]"));
    }
    public void consider() {
        List<SelenideElement> consider = new ArrayList<SelenideElement>();
        consider.add(ConsiderTraditionalMediceStronglyAgree());
        consider.add(ConsiderTraditionalMediceAgree());
        consider.add(ConsiderTraditionalMediceDisAgree());
        consider.add(ConsiderTraditionalMediceStronglyDisAgree());
        consider.get(randomGen(4)).click();
    }


    public SelenideElement recommendAnimalExcrementStrongAgree(){
            return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[93]"));
        }

    public SelenideElement recommendAnimalExcrementAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[94]"));
    }
    public SelenideElement recommendAnimalExcrementDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[95]"));
    }
    public SelenideElement recommendAnimalExcrementStrongDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[96]"));
    }

    public void RecommendAnimal() {
        List<SelenideElement> consider = new ArrayList<SelenideElement>();
        consider.add(recommendAnimalExcrementStrongAgree());
        consider.add(recommendAnimalExcrementAgree());
        consider.add(recommendAnimalExcrementDisAgree());
        consider.add(recommendAnimalExcrementStrongDisAgree());
        consider.get(randomGen(4)).click();
    }
    public SelenideElement factoresTorecommendAnimalExcrement(){
        return $(By.xpath("(//textarea[contains(@aria-label,'Your answer')])[6]"));
    }

    public SelenideElement BenefitsAnimalOverTraditionalStronglyAgree(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(47) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)");
    }
    public SelenideElement BenefitsAnimalOverTraditionalAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[98]"));
    }
    public SelenideElement BenefitsAnimalOverTraditionalDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[99]"));
    }
    public SelenideElement BenefitsAnimalOverTraditionalStronglyDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[100]"));
    }
    public void BenefitsAnimalOverTraditional() {
        List<SelenideElement> BenefitsAnimalOverTraditional = new ArrayList<SelenideElement>();
        //BenefitsAnimalOverTraditional.add(BenefitsAnimalOverTraditionalStronglyAgree());
        BenefitsAnimalOverTraditional.add(BenefitsAnimalOverTraditionalAgree());
        BenefitsAnimalOverTraditional.add(BenefitsAnimalOverTraditionalDisAgree());
        BenefitsAnimalOverTraditional.add(BenefitsAnimalOverTraditionalStronglyDisAgree());
        BenefitsAnimalOverTraditional.get(randomGen(3)).click();
    }

    public SelenideElement DNMBuyinyAnimalExcrementStronglyAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[101]"));
    }
    public SelenideElement DNMBuyinyAnimalExcrementAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[102]"));
    }
    public SelenideElement DNMBuyinyAnimalExcrementDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[103]"));
    }
    public SelenideElement DNMBuyinyAnimalExcrementStronglyDisAgree(){
        return $(By.xpath("(//div[contains(@class,'AB7Lab Id5V1')])[104]"));
    }
    public void DNMBuyinyAnimalExcrement() {
        List<SelenideElement> DNMBuyinyAnimalExcrement = new ArrayList<SelenideElement>();
        DNMBuyinyAnimalExcrement.add(DNMBuyinyAnimalExcrementStronglyAgree());
        DNMBuyinyAnimalExcrement.add(DNMBuyinyAnimalExcrementAgree());
        DNMBuyinyAnimalExcrement.add(DNMBuyinyAnimalExcrementDisAgree());
        DNMBuyinyAnimalExcrement.add(DNMBuyinyAnimalExcrementStronglyDisAgree());
        DNMBuyinyAnimalExcrement.get(randomGen(4)).click();
    }

    public SelenideElement cuturallyAcceptableToUse(){
        SelenideElement one = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement two = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement three = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement four = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
        SelenideElement five = $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(30) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > label:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)");
        SelenideElement[] arr2 = new SelenideElement[]{one, two, three, four, five};
        return (arr2[randomGen(5)]);
    }

    public SelenideElement disguistingToUseStronglyAgree(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(49) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");}
    public SelenideElement disguistingToUseAgree(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(49) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");}
    public SelenideElement disguistingToUseDisAgree(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(49) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(3) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }
    public SelenideElement disguistingToUseStronglyDisAgree(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(49) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(4) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }
    public void disguistingToUse() {
        List<SelenideElement> disguistingToUse = new ArrayList<SelenideElement>();
        disguistingToUse.add(disguistingToUseStronglyAgree());
        disguistingToUse.add(disguistingToUseAgree());
        disguistingToUse.add(disguistingToUseDisAgree());
        disguistingToUse.add(disguistingToUseStronglyDisAgree());
        disguistingToUse.get(randomGen(4)).click();
    }




    public SelenideElement influenceTheUseOfAnimalExcrement(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(51) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > textarea:nth-child(1)");
    }

    public SelenideElement toGiveFaecalMaterVeryComfortable(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(24) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }
    public SelenideElement toGiveFaecalMaterComfortable(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(24) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }
    public SelenideElement toGiveFaecalMaterUnComfortable()
    {
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(24) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(3) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }
    public SelenideElement toGiveFaecalMaterVeryUnComfortable(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(24) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(3) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }

    public void toGiveFaecalMater() {
        List<SelenideElement> toGiveFaecalMater = new ArrayList<SelenideElement>();
        toGiveFaecalMater.add(toGiveFaecalMaterVeryComfortable());
        toGiveFaecalMater.add(toGiveFaecalMaterComfortable());
        toGiveFaecalMater.add(toGiveFaecalMaterUnComfortable());
        toGiveFaecalMater.add(toGiveFaecalMaterVeryUnComfortable());
        toGiveFaecalMater.get(randomGen(4)).click();
    }

    public SelenideElement recommendToFamilyMembersStronglyAgree(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(22) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }
    public SelenideElement recommendToFamilyMembersAgree(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(21) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }
    public SelenideElement recommendToFamilyMembersDisAgree(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(22) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(3) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }
    public SelenideElement recommendToFamilyMembersStronglyDisAgree(){
        return $("body > div:nth-child(9) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(22) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(4) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    }

    public void recommendToFamilyMembers() {
        List<SelenideElement> recommendToFamily = new ArrayList<SelenideElement>();
        recommendToFamily.add(recommendToFamilyMembersStronglyAgree());
        recommendToFamily.add(recommendToFamilyMembersAgree());
        recommendToFamily.add(recommendToFamilyMembersDisAgree());
        recommendToFamily.add(recommendToFamilyMembersStronglyDisAgree());
        recommendToFamily.get(randomGen(4)).click();
    }


    public SelenideElement sumbmitBtn(){
        return $(By.xpath("(//span[contains(text(),'Submit')])[1]"));
    }












}

