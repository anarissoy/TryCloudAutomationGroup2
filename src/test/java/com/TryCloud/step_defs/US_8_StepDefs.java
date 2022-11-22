package com.TryCloud.step_defs;

import com.TryCloud.pages.DeletedFilePage_Gulru;
import com.TryCloud.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_8_StepDefs {

    DeletedFilePage_Gulru deletedFilePage_gulru = new DeletedFilePage_Gulru();
    LoginPage loginPage = new LoginPage();




//    @Given("the user clicks the Files module")
//    public void the_user_clicks_the_files_module() {
//        deletedFilePage_gulru.clickFile.click();
//    }
    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        deletedFilePage_gulru.optionBox.click();
    }
    @When("user choose the Delete f option")
    public void user_choose_the_delete_f_option() {
        deletedFilePage_gulru.deleteFile.click();
    }
    @When("the user clicks the Deleted files sub-module on the left side")
    public void the_user_clicks_the_deleted_files_sub_module_on_the_left_side() {
        deletedFilePage_gulru.deletedFiles.click();
    }
    @Then("Verify the deleted file is displayed on the page")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        deletedFilePage_gulru.deletedFile.isDisplayed();
    }
}
