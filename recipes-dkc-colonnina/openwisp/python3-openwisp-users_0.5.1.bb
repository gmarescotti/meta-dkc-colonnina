
SUMMARY = "Provides basic multi-tenancy features for OpenWISP (using the Django web-framework)"
HOMEPAGE = "http://openwisp.org"
AUTHOR = "Federico Capoano <federico.capoano@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c3f07c9d32525dc639bfb0e568297ab6"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/81/03/9351fd18346e59c981257aa561fbd31088caefbb5a5a8a6747dc7c20a9c7/openwisp-users-0.5.1.tar.gz"
SRC_URI[md5sum] = "e99b4d0cb9efc3c4b084e2d52edb5a74"
SRC_URI[sha256sum] = "9aa975b5f467915e67dbca53aee3de1aa8d0cb4336c22375cef27347314157cd"

S = "${WORKDIR}/openwisp-users-0.5.1"

DEPENDS += " "
RDEPENDS_${PN} = "python3-django-allauth python3-django-extensions python3-django-organizations python3-django-phonenumber-field python3-openwisp-utils python3-packaging python3-phonenumbers python3-swapper"

BBCLASSEXTEND = "native nativesdk"
