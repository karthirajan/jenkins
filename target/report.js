$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddCustomer.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "The user is in telecom page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_is_in_telecom_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigates to add customer details",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_navigates_to_add_customer_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user fill in the forms",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "address",
        "telephone"
      ]
    },
    {
      "cells": [
        "text",
        "abcde",
        "kr@gmail.com",
        "tanjore",
        "8967"
      ]
    },
    {
      "cells": [
        "text",
        "bcdef",
        "ar@gmail.com",
        "nil",
        "6789"
      ]
    },
    {
      "cells": [
        "text",
        "cbdfr",
        "vr@gmail.com",
        "nil",
        "1234"
      ]
    },
    {
      "cells": [
        "text",
        "dhjyr",
        "sr@gmail.com",
        "nil",
        "7865"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_fill_in_the_forms(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user submits the form",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_submits_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The customer should see the id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.the_customer_should_see_the_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "The user is in telecom page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_is_in_telecom_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigates to add customer details",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_navigates_to_add_customer_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user fill in the forms",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "address",
        "telephone"
      ]
    },
    {
      "cells": [
        "text",
        "abcde",
        "kr@gmail.com",
        "tanjore",
        "8967"
      ]
    },
    {
      "cells": [
        "text",
        "bcdef",
        "ar@gmail.com",
        "nil",
        "6789"
      ]
    },
    {
      "cells": [
        "text",
        "cbdfr",
        "vr@gmail.com",
        "nil",
        "1234"
      ]
    },
    {
      "cells": [
        "text",
        "dhjyr",
        "sr@gmail.com",
        "nil",
        "7865"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_fill_in_the_forms(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user submits the form",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_submits_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The customer should see the id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.the_customer_should_see_the_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
});