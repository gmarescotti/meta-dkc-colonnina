
SUMMARY = "GPIO access via Trio and libgpiod."
HOMEPAGE = ""
AUTHOR = "Matthias Urlichs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa7b86389e58dd4087a8d2b833e5fe96"

inherit setuptools3 

SRC_URI = "https://files.pythonhosted.org/packages/4a/48/e26bce022b585e68f1aca666a1ea823a077c857123dc72e9ae88d7437813/asyncgpio-0.5.0.tar.gz"
SRC_URI[sha256sum] = "d3bbb777eb446e3f8e8545474fef6605e375ca7fadb62dd63df656c434d69512"

S = "${WORKDIR}/asyncgpio-0.5.0"

DEPENDS += " python3-setuptools-scm-native "
RDEPENDS_${PN} = "python3-anyio python3-sniffio python3-watchdog"

BBCLASSEXTEND = "native nativesdk"
