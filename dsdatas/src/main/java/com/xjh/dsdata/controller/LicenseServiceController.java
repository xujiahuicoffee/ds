package com.xjh.dsdata.controller;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @author xujiahui
 * @Description
 * @create 2021/7/20 22:13
 */
@RestController
@RequestMapping(value="/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    // http://127.0.0.1:8080/v1/organizations/12/licenses/m1/25
    @GetMapping(value = "/m1/{licenseId}")
    public License getLicenses(@PathVariable("organizationId") String organizationId,
                               @PathVariable String licenseId) {
        return new License()
                .withId(licenseId)
                .withProductName("ShangHaoJia")
                .withLicenseType("food");
    }

    // http://127.0.0.1:8080/v1/organizations/12/licenses/m2?licenseId=30
    @GetMapping(value = "/m2")
    public License getLicenses2(@PathVariable("organizationId") String organizationId,
                               @PathParam("licenseId") String licenseId) {
        return new License()
                .withId(licenseId)
                .withProductName("ShangHaoJia")
                .withLicenseType("food");
    }

    // http://127.0.0.1:8080/v1/organizations/12/licenses/m3?licenseId=30
    @GetMapping(value = "/m3")
    public License getLicenses3(@PathVariable("organizationId") String organizationId,
                                @RequestParam("licenseId") String licenseId) {
        return new License()
                .withId(licenseId)
                .withProductName("ShangHaoJia")
                .withLicenseType("food");
    }

}


class License {

    private String id;

    private String productName;

    private String licenseType;

    public License withId(String id) {
        this.setId(id);
        return this;
    }

    public License withProductName(String productName) {
        this.setProductName(productName);
        return this;
    }

    public License withLicenseType(String licenseType) {
        this.setLicenseType(licenseType);
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}