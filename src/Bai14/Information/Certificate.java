package Bai14.Information;

import java.time.LocalDate;

public class Certificate {
    private String CertificatedID, CertificateName, CertificateRank;
    private LocalDate CertificatedDate;

    public Certificate(String certificatedID, String certificateName, String certificateRank, LocalDate certificatedDate) {
        CertificatedID = certificatedID;
        CertificateName = certificateName;
        CertificateRank = certificateRank;
        CertificatedDate = certificatedDate;
    }

    public String getCertificatedID() {
        return CertificatedID;
    }

    public void setCertificatedID(String certificatedID) {
        CertificatedID = certificatedID;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateRank() {
        return CertificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        CertificateRank = certificateRank;
    }

    public LocalDate getCertificatedDate() {
        return CertificatedDate;
    }

    public void setCertificatedDate(LocalDate certificatedDate) {
        CertificatedDate = certificatedDate;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "CertificatedID='" + CertificatedID + '\'' +
                ", CertificateName='" + CertificateName + '\'' +
                ", CertificateRank='" + CertificateRank + '\'' +
                ", CertificatedDate=" + CertificatedDate +
                '}';
    }
}
