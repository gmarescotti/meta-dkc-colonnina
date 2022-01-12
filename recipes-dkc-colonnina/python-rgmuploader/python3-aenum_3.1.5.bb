
SUMMARY = "Advanced Enumerations (compatible with Python's stdlib Enum), NamedTuples, and NamedConstants"
HOMEPAGE = "https://github.com/ethanfurman/aenum"
AUTHOR = "Ethan Furman <ethan@stoneleaf.us>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup.py;md5=2fb55e00966e2559320365b6e6f9c6bd"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/28/5d/fd9753c16337373376817f61352b624ba8affd33e0f6d1b92e635ffcb0dc/aenum-3.1.5.tar.gz"
SRC_URI[md5sum] = "fccf14a41b664484fae33c42d20cb713"
SRC_URI[sha256sum] = "2ebad8590b6a0183c0d9893523b458edce987ae4533339c5ac185cfac32daf1a"

S = "${WORKDIR}/aenum-3.1.5"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
