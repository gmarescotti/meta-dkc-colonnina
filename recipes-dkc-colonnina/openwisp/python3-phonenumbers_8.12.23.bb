
SUMMARY = "Python version of Google's common library for parsing, formatting, storing and validating international phone numbers."
HOMEPAGE = "https://github.com/daviddrysdale/python-phonenumbers"
AUTHOR = "David Drysdale <dmd@lurklurk.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

SRC_URI = "https://files.pythonhosted.org/packages/ee/22/2e62afc6ae306056e8373753ac1424a9ae50049286d2bb571d8f0720324a/phonenumbers-8.12.23.tar.gz"
SRC_URI[md5sum] = "ba75eb2964e43ca0d1d327d4e6710f89"
SRC_URI[sha256sum] = "8b0cf3df6ab75d22717af91014ca690423a85e77abc7b199748d1b3598b49a37"

S = "${WORKDIR}/phonenumbers-8.12.23"

RDEPENDS_${PN} = ""

inherit setuptools3
