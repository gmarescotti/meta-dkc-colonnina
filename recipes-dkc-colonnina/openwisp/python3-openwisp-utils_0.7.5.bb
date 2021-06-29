
SUMMARY = "OpenWISP 2 Utilities"
HOMEPAGE = "http://openwisp.org"
AUTHOR = "Rohith Asrk <rohith.asrk@gmail.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cf46babe204b118daa74adc8adb910f8"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/e4/f1/27d475b74e5939b62f06a77e0236b046b7c97ebadfa3a35d90581c468b87/openwisp-utils-0.7.5.tar.gz"
SRC_URI[md5sum] = "ca98f842435e02bf4d83fd272bd1b1b5"
SRC_URI[sha256sum] = "79a2549322eabb01fc727b40f66850d0b92001b8299f1707f15d741d43657067"

S = "${WORKDIR}/openwisp-utils-0.7.5"

DEPENDS += " "
RDEPENDS_${PN} = "python3-django-model-utils"

BBCLASSEXTEND = "native nativesdk"
