
$(document).ready(function () {
    $("#editdisplay").hide();
    $("#deletedisplay").hide();
    $("#showdisplay").hide();
    $("#adddisplay").hide();
    $("#add").click(function () {
        $("#editdisplay").hide();
        $("#deletedisplay").hide();
        $("#showdisplay").hide();
        $("#adddisplay").show();
    });
    $("#show").click(function () {
        $("#editdisplay").hide();
        $("#deletedisplay").hide();
        $("#showdisplay").show();
        $("#adddisplay").hide();
    });
    $("#delete").click(function () {
        $("#editdisplay").hide();
        $("#deletedisplay").show();
        $("#showdisplay").hide();
        $("#adddisplay").hide();
    });
    $("#edit").click(function () {
        $("#editdisplay").show();
        $("#deletedisplay").hide();
        $("#showdisplay").hide();
        $("#adddisplay").hide();
    });
});