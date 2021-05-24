
SUMMARY = "The unofficial Django swappable models API."
HOMEPAGE = "https://github.com/wq/django-swappable-models"
AUTHOR = "S. Andrew Sheppard <andrew@wq.io>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d252c0f14f2950a0af8694701e0ba793"

SRC_URI = "https://files.pythonhosted.org/packages/f1/1d/6060584adde0c951a1c0de668fbb319eb17abb3f095ade1aff176143cb4f/swapper-1.1.2.post1.tar.gz"
SRC_URI[md5sum] = "aef8fd86af4d9fcca579340b7f8f9133"
SRC_URI[sha256sum] = "51651018fb027354dd27ff38d5eb47a225d3e642c99b04cff878ae65b1872f64"

S = "${WORKDIR}/swapper-1.1.2.post1"

RDEPENDS_${PN} = ""

inherit setuptools3
