
SUMMARY = "An international phone number field for django models."
HOMEPAGE = "https://github.com/stefanfoulis/django-phonenumber-field"
AUTHOR = "Stefan Foulis <stefan@foulis.ch>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=223b522570c3f95e481139f3c59ea929"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/0b/3b/9c28382dfc17e781c3128cc626e217674ebb291974b6a0e69468c1f2c3f6/django-phonenumber-field-5.2.0.tar.gz"
SRC_URI[md5sum] = "80c7094f9445f848e05f43694a237a26"
SRC_URI[sha256sum] = "52b2e5970133ec5ab701218b802f7ab237229854dc95fd239b7e9e77dc43731d"

S = "${WORKDIR}/django-phonenumber-field-5.2.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-django"

BBCLASSEXTEND = "native nativesdk"
