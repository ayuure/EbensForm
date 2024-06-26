package com.example.ebensfrom;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Selenide;

import java.util.Random;

public class runTest {
    public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    @Test
    public void formField() throws InterruptedException {

        int count = 10;
        for (int i= 0; i <= count; i++) {
            formAutomation Form = new formAutomation();
            Form.visitUrl();
            Form.ageField().val(String.valueOf(getRandomNumberInRange(18, 25)));
            Form.sexList();
            Form.religionList();
            Form.programOfStudySelector().click();
            Form.ProgramOfStudy().click();
            Form.studyLevel().click();
            //Form.programOfStudySelector().click();
            //Thread.sleep(10000);
            //Assert.assertTrue(Form.SelectorsForDropDown().is);
            // Form.pharmarcy().click();
            // Form.SelectorsForDropDown().get(5).click();
            Form.LevelOfStudyYear().click();
            Form.region().click();
            Form.Region().click();
            Form.EducationLevel();
            Form.eductionLevelMum().click();
            Form.Settlement();
            Form.accommodation();
            Form.yesNoFMT();
            Form.administerFMT().val("Colonoscopy, Nasogastric or Nasoduodenal Tube, Capsules");
            Form.potentionalRisk().val("Infection, Adverse Reactions, Unknown Long-term Effects");
            Form.scaleFMT().click();
            Form.recFMT();
            Form.influence().val(" Sharing success stories and case studies from reliable sources, Support and recommendations from trusted healthcare professionals.");
            Form.ComfortLevel();
            Form.FaecalCom();
            Form.Benefits();
            Form.Medicine();
            Form.Disgust();
            Form.scaleCulturalAcceptance();
            Form.IntegrateYesNo();
            Form.toGiveFaecalMater();
            Form.acceptFaecalMatter().val("Implement public health campaigns to educate people about the benefits, safety, and scientific basis of Faecal Microbiota Transplantation (FMT), Share success stories and case studies of individuals who have benefited from FMT, Engage community leaders and influencers to discuss the procedure within cultural and religious contexts");
            Form.DYKANIMAL();
            Form.DoYouUse();
            Form.Use();
            Form.PurposeYouUsed().val("Skin Conditions, Digestive Issues");
            Form.LevelOfSatisfaction();
            Form.Satsss();
            Form.consider();
            Form.RecommendAnimal();
            Form.factoresTorecommendAnimalExcrement().val("Personal experiences or anecdotal evidence from others who have benefited.");
            Form.BenefitsAnimalOverTraditional();
            Form.DNMBuyinyAnimalExcrement();
            Form.cuturallyAcceptableToUse().click();
            Form.influenceTheUseOfAnimalExcrement().val("Compatibility with local cultural and traditional beliefs about medicine and healing, proper regulation and standardization to ensure safety and efficacy, Availability and affordability for the general population. ");
            Form.recommendToFamilyMembers();
            Form.scaleAcceptance();
            Form.disguistingToUse();
            Form.sumbmitBtn();

            //Thread.sleep(5000);
        }
    }
}
