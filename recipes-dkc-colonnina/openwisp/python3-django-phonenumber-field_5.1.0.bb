
SUMMARY = "An international phone number field for django models."
HOMEPAGE = "https://github.com/stefanfoulis/django-phonenumber-field"
AUTHOR = "Stefan Foulis <stefan@foulis.ch>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=223b522570c3f95e481139f3c59ea929"

SRC_URI = "https://files.pythonhosted.org/packages/09/87/3e6438445d40bea0aea2c508cade51e2b0af285457319fbf3584731a47a0/django-phonenumber-field-5.1.0.tar.gz"
SRC_URI[md5sum] = "d4b875c3225d293ded2d67083cc0f06d"
SRC_URI[sha256sum] = "9eda963ac15b363393f677cc084efd45c3bd97bb5a0cdb4a06409ac99e05dd4b"

S = "${WORKDIR}/django-phonenumber-field-5.1.0"

RDEPENDS_${PN} = "python3-django"

inherit setuptools3
