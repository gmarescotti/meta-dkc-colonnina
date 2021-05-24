
SUMMARY = "Easily download, build, install, upgrade, and uninstall Python packages"
HOMEPAGE = "https://github.com/pypa/setuptools"
AUTHOR = "Python Packaging Authority <distutils-sig@python.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

SRC_URI = "https://files.pythonhosted.org/packages/88/fc/d17731c0cc67a5a8e385e4f47c3b0b186720e198b70f076ccb4676804a8f/setuptools-57.0.0.tar.gz"
SRC_URI[md5sum] = "60ae3b43cd2ced1385f75468d658c5b6"
SRC_URI[sha256sum] = "401cbf33a7bf817d08014d51560fc003b895c4cdc1a5b521ad2969e928a07535"

S = "${WORKDIR}/setuptools-57.0.0"

RDEPENDS_${PN} = ""

inherit setuptools3
