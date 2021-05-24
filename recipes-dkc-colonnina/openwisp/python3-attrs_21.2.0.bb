
SUMMARY = "Classes Without Boilerplate"
HOMEPAGE = "https://www.attrs.org/"
AUTHOR = "Hynek Schlawack <hs@ox.cx>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff"

SRC_URI = "https://files.pythonhosted.org/packages/ed/d6/3ebca4ca65157c12bd08a63e20ac0bdc21ac7f3694040711f9fd073c0ffb/attrs-21.2.0.tar.gz"
SRC_URI[md5sum] = "06af884070d9180694becdb106e5cd65"
SRC_URI[sha256sum] = "ef6aaac3ca6cd92904cdd0d83f629a15f18053ec84e6432106f7a4d04ae4f5fb"

S = "${WORKDIR}/attrs-21.2.0"

RDEPENDS_${PN} = ""

inherit setuptools3
