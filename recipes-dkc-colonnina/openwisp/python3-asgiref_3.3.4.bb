
SUMMARY = "ASGI specs, helper code, and adapters"
HOMEPAGE = "https://github.com/django/asgiref/"
AUTHOR = "Django Software Foundation <foundation@djangoproject.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f09eb47206614a4954c51db8a94840fa"

SRC_URI = "https://files.pythonhosted.org/packages/d8/3f/ef696a6d8254f182b1a089aeffb638d2eb83055e603146d3a40605c5b7da/asgiref-3.3.4.tar.gz"
SRC_URI[md5sum] = "5afe03ecc39ae94950ff95e80166d945"
SRC_URI[sha256sum] = "d1216dfbdfb63826470995d31caed36225dcaf34f182e0fa257a4dd9e86f1b78"

S = "${WORKDIR}/asgiref-3.3.4"

RDEPENDS_${PN} = ""

inherit setuptools3
